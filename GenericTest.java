

public class GenericTest{
    public static void main(String[] args){
        String test = new String("Test!!!!!!!");
        GenericExample<String> g = new GenericExample<String>(test);
        System.out.println(g.getData());
    }
}
class GenericExample<T>{
    private T data;
    public GenericExample(T data){
        this.data = data;
    }
    public void setData(T newData){
        this.data = newData;
    }
    public T getData(){
        return this.data;
    }

}