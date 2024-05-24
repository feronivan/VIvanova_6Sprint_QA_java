import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionExceptionTest {
    private final String sex;

    @Parameterized.Parameters
    public static Object [][] dataLion() {
        return new Object[][] {
                {"unknown"},
                {null},
                {"Альфа-самец"},
                {"Альфа-самка"},
        };
    }

    public LionExceptionTest(String sex) {
        this.sex = sex;
    }

    @Test(expected = Exception.class)
    public void doesHaveMane() throws Exception {
        new Lion(sex, null);
    }
}