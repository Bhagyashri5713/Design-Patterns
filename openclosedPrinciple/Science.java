package openclosedPrinciple;

public class Science extends StudentInfo {
    Science(String sr) {
        super(sr);
    }

    @Override
    public String streamName(String sr)
    {
        return "Science stream";
    }
}
