import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class DnDMainController {
    private Model model;
    private DnDMainView view;

    public DnDMainController(Model model, DnDMainView view){
        this.view = view;
        this.model = model;
    }

    private Character makeCharacter(){
        Character character = new Character();

        character.setName(view.getNameTextField().getText());
        character.setDndClass(ClassFactory.getClass(view.getClassComboBox().getSelectedItem().toString()));
        character.setRace(model.getRaceFactory(view.getRaceComboBox().getSelectedItem().toString()).create());
        character.setAttributes(new Stats(model.getBufferStats()));
        character.addRaceBonuses();
        character.addClassBonuses();

        return character;
    }

    private void updateStats(Stats stats){
        model.setBufferStats(stats);
        view.getStrengthTextField().setText(stats.getStats().get("strength").toString());
        view.getDexterityTextField().setText(stats.getStats().get("dexterity").toString());
        view.getConstitutionTextField().setText(stats.getStats().get("constitution").toString());
        view.getIntellectTextField().setText(stats.getStats().get("intellect").toString());
        view.getWisdomTextField().setText(stats.getStats().get("wisdom").toString());
        view.getCharismaTextField().setText(stats.getStats().get("charisma").toString());
    }

    public void previewCharacter(){
        try{
            if(view.getNameTextField().getText() == null) throw new NullPointerException("Name can`t be empty");
            if(view.getClassComboBox().getSelectedItem() == null) throw new NullPointerException("Class can`t be empty");
            if(view.getRaceComboBox().getSelectedItem() == null) throw new NullPointerException("Race can`t be empty");
            if(model.getBufferStats() == null) throw new NullPointerException("Stats can`t be empty");

            model.presaveCharacter(makeCharacter());
            view.getCharacterTextArea().setText(model.getBufferCharacter().toString());
        } catch (Exception e){
            view.getMessageTextArea().setText(e.getMessage());
        }
    }

    public void saveCharacter(){
        try{
            if(view.getNameTextField().getText() == null) throw new NullPointerException("Name can`t be empty");
            if(view.getClassComboBox().getSelectedItem() == null) throw new NullPointerException("Class can`t be empty");
            if(view.getRaceComboBox().getSelectedItem() == null) throw new NullPointerException("Race can`t be empty");
            if(model.getBufferStats() == null) throw new NullPointerException("Stats can`t be empty");

            if(model.getBufferCharacter() == null){
                model.presaveCharacter(makeCharacter());
            }
            model.saveCharacter();
        } catch (Exception e){
            view.getMessageTextArea().setText(e.getMessage());
        }

        view.getCharacterTextArea().setText("");
        view.getNameTextField().setText("");
        view.getStrengthTextField().setText("");
        view.getDexterityTextField().setText("");
        view.getConstitutionTextField().setText("");
        view.getIntellectTextField().setText("");
        view.getWisdomTextField().setText("");
        view.getCharismaTextField().setText("");
        view.getClassComboBox().setSelectedIndex(0);
        view.getRaceComboBox().setSelectedIndex(0);

        view.getMessageTextArea().setText("Character saved successfully");
    }

    public void previewAllCharacters(){
        for(Character character: model.getCharacters()){
            view.getAllCharactersTextArea().append(character.toString());
            view.getAllCharactersTextArea().append("\n");
        }
    }
    
    public void updateCharacterStats(){
        Stats stats = Stats.generate();
        updateStats(stats);
    }

    public void saveStats(){
        if(model.getBufferStats() != null){
            model.setCareTaker(new CareTaker());
            model.getCareTaker().add(new Memento(model.getBufferStats()));
            view.getMessageTextArea().setText("Stats saved successfully");
        } else {
            view.getMessageTextArea().setText("There are no stats to save");
        }
    }

    public void loadStats(){
        Memento mem = model.getCareTaker().get(0);
        if(mem != null){
            Stats stats = mem.getState();
            updateStats(stats);
        }else{
            view.getMessageTextArea().setText("Stats was not saved");
        }
    }

    public void saveJSON(){
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();

        try(FileWriter fw = new FileWriter("characters.json")){
            for(Character character: model.getCharacters()){
                jsonObject.clear();
                jsonObject.putAll(model.getVisitor().visit(character));
                jsonObject.putAll(model.getVisitor().visit(character.getDndClass()));
                jsonObject.putAll(model.getVisitor().visit(character.getRace()));
                jsonObject.putAll(model.getVisitor().visit(character.getAttributes()));

                jsonArray.add(jsonObject.clone());
            }

            fw.write(jsonArray.toJSONString());
        } catch (IOException e) {
            view.getMessageTextArea().setText("Getting Error opening/creating file");
        }
    }
}
