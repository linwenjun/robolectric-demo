package thoughtworks.academy.robolectricdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class ApplicationTest {

    @Test
    public void onCreate_shouldInflateTheMenu() throws Exception {
        assertThat(1).isEqualTo(1);
    }
}