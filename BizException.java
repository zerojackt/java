public class BizException extends RuntimeException {

    public BizException(String mag) {
        super(mag);
    }

    public  BizException(Exception ex) {
        super(ex);
    }
}
