package openclosedPrinciple;

public class Commerce extends StudentInfo {

    Commerce(String sr) {
        super(sr);
    }

    @Override
    public String streamName(String sr)
    {
        return "Commerce stream";
    }
}
