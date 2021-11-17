package manoj.appcomp.whatsapp_clone.Models;

public class Users {

    String profilePic, userName, userMail, userPassword;
    String userId, lastMessage, status;

    public Users()
    {
    }

    public Users(String profilePic, String userName, String userMail, String userPassword, String userId, String lastMessage, String status) {
        this.profilePic = profilePic;
        this.userName = userName;
        this.userMail = userMail;
        this.userPassword = userPassword;
        this.userId = userId;
        this.lastMessage = lastMessage;
        this.status = status;
    }

    public Users(String userName, String userMail, String userPassword) {
        this.userName = userName;
        this.userMail = userMail;
        this.userPassword = userPassword;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
