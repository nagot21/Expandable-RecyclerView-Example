package nagot.expandlerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppInfo simpleEvCalcContent = new AppInfo("SimpleEvCalc", "version 2", "new test version");
        AppInfo vectorFlappyContent = new AppInfo("Vector Flappy", "version 1", "release version");

        App simpleEvCalc = new App(Arrays.asList(simpleEvCalcContent), "SimpleEvCalc");
        App vectorFlappy = new App(Arrays.asList(vectorFlappyContent), "Vector Flappy");

        List<App> apps = Arrays.asList(simpleEvCalc, vectorFlappy);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        TestAdapter adapter = new TestAdapter(this, apps);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
