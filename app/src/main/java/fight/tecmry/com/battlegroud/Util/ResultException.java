package fight.tecmry.com.battlegroud.Util;

/**
 * Created by Tecmry on 2017/9/26.
 */

public class ResultException extends Exception
{
    public static final int ResultExceptionId = 0011;
    public int ErrorCode;
    public ResultException()
    {
        super();
    }
    public ResultException(int errorCode)
    {
        super(String.valueOf(errorCode));
        this.ErrorCode = errorCode;
    }
}
