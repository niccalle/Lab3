package tests;

import android.test.ActivityInstrumentationTestCase;
import android.test.ActivityInstrumentationTestCase2;

import com.example.nicolascalle.testproject.MainActivity;

/**
 * Created by Nicolas Calle on 4/20/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_first()
    {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);
    }
}
