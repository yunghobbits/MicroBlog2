public class UserInfo
{
    public String userName;
    private String realName;
    public String webPic;
    public String emailAdd;    
    public UserInfo(String userName,String realName,String webPic,String emailAdd){        
        this.userName=userName;
        this.realName=realName;
        this.webPic=webPic;
        this.emailAdd=emailAdd;        
    }    
    public String getUserInfo(){ 
        return userName +"\n" +realName+"\n"+webPic+"\n"+emailAdd;
    }
}