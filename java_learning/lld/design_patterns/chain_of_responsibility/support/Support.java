package java_learning.lld.design_patterns.chain_of_responsibility.support;


abstract class SupportHandler {
    private SupportHandler nextHandler;

    protected SupportHandler getNextHandler() {
        return this.nextHandler;
    }

    public void setNextHandler(SupportHandler handler){
        this.nextHandler = handler;
    }

    public abstract void handleRequest(String requestType);

}

class GeneralSupport extends SupportHandler{

    @Override
    public void handleRequest(String requString){
        if(requString.equals("General")){
            System.out.println("General Support");
        } else {
            getNextHandler().handleRequest(requString);
        }
    }
}








public class Support {
    
}
