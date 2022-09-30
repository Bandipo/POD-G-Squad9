package models;

public class CodeReview {
    final static int CODE_REVIEW_TIME_IN_MINUTES = 25;
    boolean isPODMemberReady;
    boolean isStackAssociateReady;
    public CodeReview(boolean isPODMemberReady, boolean isStackAssociateReady){
        this.isPODMemberReady = isPODMemberReady;
        this.isStackAssociateReady = isStackAssociateReady;
    }
    public String doCodeReview(){
        synchronized (this){
            return isPODMemberReady && isStackAssociateReady ? "Code Review Time" : "Not yet time for Code Review";
        }
    }
}
