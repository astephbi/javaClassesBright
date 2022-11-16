package javaLecture9;

public interface APIInterface {

    // if u want to use my API, you have to implement those methods
    void didCancel();
    // I do not need to return u something if the call of ur API failed

    void didFailed(String reason);
    //tell me reason why it failed

    String didReceiveResult();
}
