public class Button {
    interface OnClickListener {
        void onClick();
    }
    private OnClickListener listener;

    public void setOnClickListern(OnClickListener listener){
        this.listener = listener;
    }

    public void click(){
        if(listener != null){
            listener.onClick();
        }
    }

    private class ClickHanler implements OnClickListener{

        @Override
        public void onClick() {

        }
    }
    public void simulate(){
        setOnClickListern(new ClickHanler());
        click();
    }

    public static void main(String[] args) {
        Button btn = new Button();
        btn.simulate();
    }
}