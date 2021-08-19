package digital.innovation.one.utils.operation;

import digital.innovation.one.utils.operation.internal.DivHelper;
import digital.innovation.one.utils.operation.internal.MultiHelper;
import digital.innovation.one.utils.operation.internal.SubHelper;
import digital.innovation.one.utils.operation.internal.SumHelper;

public class Calculator {

    private SumHelper sumHelper;
    private MultiHelper multiHelper;
    private SubHelper subHelper;
    private DivHelper divHelper;

    public Calculator () {
        sumHelper = new SumHelper();
        multiHelper = new MultiHelper();
        subHelper = new SubHelper();
        divHelper =  new DivHelper();
    }

    public int sum (int a, int b) {
        return sumHelper.execute(a, b);
    }

    public int sub (int a, int b) {
        return subHelper.execute(a, b);
    }

    public int multi (int a, int b) {
        return multiHelper.execute(a, b);
    }

    public int div (int a, int b) {
        return divHelper.execute(a, b);
    }
}
