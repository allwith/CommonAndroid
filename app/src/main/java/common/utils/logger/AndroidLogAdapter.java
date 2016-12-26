package common.utils.logger;

import android.util.Log;

import com.android.common.utils.logger.*;

public class AndroidLogAdapter implements com.android.common.utils.logger.LogAdapter {
  @Override public void d(String tag, String message) {
    Log.d(tag, message);
  }

  @Override public void e(String tag, String message) {
    Log.e(tag, message);
  }

  @Override public void w(String tag, String message) {
    Log.w(tag, message);
  }

  @Override public void i(String tag, String message) {
    Log.i(tag, message);
  }

  @Override public void v(String tag, String message) {
    Log.v(tag, message);
  }

  @Override public void wtf(String tag, String message) {
    Log.wtf(tag, message);
  }
}