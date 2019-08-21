package android.bignerdranch.com;


import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class CrimeListActivityTest {

    @Rule
    public ActivityTestRule<CrimeListActivity> mActivityTestRule = new ActivityTestRule<>(CrimeListActivity.class);

    @Test
    public void crimeListActivityTest() {
    }
}
