public class BizService {

    public void bizmethod(int i) throws BizException {
        System.out.println("biz method start!");

        if(i<0) throw new BizException("parameter i should be 0 or more");

        System.out.println("biz method end!");
    }
}
