package com.tedpark.buildtimespeedupsample;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    TextView tvVersion = (TextView) findViewById(R.id.tv_version);

    int versionCode = -1;
    try {
      PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
      versionCode = pInfo.versionCode;

    } catch (PackageManager.NameNotFoundException e) {
      e.printStackTrace();
    }

    tvVersion.setText("versionCode: " + versionCode);
  }
}
