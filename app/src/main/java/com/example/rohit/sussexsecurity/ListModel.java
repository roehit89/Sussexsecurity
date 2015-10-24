package com.example.rohit.sussexsecurity;

/**
 * Created by Rohit on 10/20/2015.
 */
public class ListModel {

    private  String post_message="";
    private  String Image="";
  //  private  String Url="";

    /*********** Set Methods ******************/

    public void setPost_message(String post_message)
    {
        this.post_message = post_message;
    }

    public void setImage(String Image)
    {
        this.Image = Image;
    }

   // public void setUrl(String Url)
//    {
//        this.Url = Url;
//    }

    /*********** Get Methods ****************/

    public String getPost_message()
    {
        return this.post_message;
    }

    public String getImage()
    {
        return this.Image;
    }

    //public String getUrl()
//    {
//        return this.Url;
//    }

}
