public class BlogPost
{
    public String postComment;
    public String whatUserPosted;    
    public BlogPost(String postComment,String whatUserPosted){     
        this.postComment=postComment;
        this.whatUserPosted = whatUserPosted; 
    }           
    public String getUserPost(){             
        return postComment+"\nUser Info:\n"+whatUserPosted;       
    }    
}