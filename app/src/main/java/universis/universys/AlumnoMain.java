package universis.universys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AlumnoMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CacheHelper.context = this;
        setContentView(R.layout.activity_alumno_main);
    }
}
