public class MVCDemo {

    public static void main(String args[]) {

        Model model = new Model();
        DnDMainView view = new DnDMainView();
        DnDMainController controller = new DnDMainController(model, view);
        view.setController(controller);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                view.setVisible(true);
            }
        });
    }
}
