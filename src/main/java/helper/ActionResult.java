package helper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ActionResult
{
    private static Logger logger = LoggerFactory.getLogger(ActionResult.class);
    public static void actionResult(Boolean result,String message){
        StackTraceElement stack[] = (new Throwable()).getStackTrace();
        logger.info(stack[1].getMethodName());
         if (result){
             logger.info("run ["+"] success. :"+message);
         }else {
             throw new ActionError("run ["+"] error. :"+message);
         }
    }
}
