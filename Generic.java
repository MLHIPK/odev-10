public class Generic<T> {
    private  T content;
    public T getContent()
    {
        return content;
    }
  public void setContent(T content) {
        this.content = content;
    }
   public void printContent() {
        System.out.println("Generic Content: " + content);
    }
}
   
       