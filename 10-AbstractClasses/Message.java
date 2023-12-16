public abstract class Message {
    String text;

    public Message(String text){
        this.text = text;
    }

    public Message(){
        this.text = "";
    }


    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int charNumber() {
        char[] chars = text.toCharArray();
        return chars.length;
    }

    public abstract void send();

}
