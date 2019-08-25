public class BizExam {

    public static void main(String[] args) {

        BizService biz = new BizService();
        biz.bizmethod(5);
        try {

        biz.bizmethod(-1);

        }catch (Exception e) {

            e.printStackTrace();

        }

    }
}
