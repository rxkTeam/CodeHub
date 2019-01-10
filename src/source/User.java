package source;

/**
 * Created by Administrator on 2019/1/10/010.
 */
public class User {
    String name,pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    float score;
    public User(){
        System.out.println("this is constructor");
    }
    public User(String name,String pwd){
        this.name=name;
        this.pwd=pwd;
    }
}
