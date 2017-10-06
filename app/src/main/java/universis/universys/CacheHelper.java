package universis.universys;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import org.json.JSONException;
import org.json.JSONObject;


public class CacheHelper {

    private static final String CACHE_CONFIGURATION_NAME = "cache";
    private static final String CACHE_ERROR_NAME = "errorId";
    private static final String CACHE_ERROR_NUMBER = "4516";

    public static Context context;

    public static String getStringProperty(Integer key) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(CACHE_CONFIGURATION_NAME,Activity.MODE_PRIVATE);
        String res = null;
        if(!sharedPreferences.contains(key.toString())) {
            try {
                return new JSONObject().put(CACHE_ERROR_NAME, CACHE_ERROR_NUMBER).toString();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (sharedPreferences != null) {
            res = sharedPreferences.getString(key.toString(), null);
        }
        return res;
    }

    public static void setStringProperty(Integer key, String value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(CACHE_CONFIGURATION_NAME, Activity.MODE_PRIVATE);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(key.toString(), value);
            editor.commit();
        }
    }

}
