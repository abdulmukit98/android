```
res -->  Android Resource Directory --> menu folder
menu --> Menu Resource file

```


### xml

      <?xml version="1.0" encoding="utf-8"?>
      <menu xmlns:android="http://schemas.android.com/apk/res/android"
          xmlns:app="http://schemas.android.com/apk/res-auto">

          <item android:id="@+id/menuDashboard"
              android:icon="@drawable/ic_baseline_shop_24"
              android:title="Dashboard"
              app:showAsAction="always"
              />

      </menu>

### on activity

      @Override
      public boolean onCreateOptionsMenu(Menu menu) {
          MenuInflater menuInflater = getMenuInflater();
          menuInflater.inflate(R.menu.main_menu, menu);
          return super.onCreateOptionsMenu(menu);
      }




    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menuDashboard:
                startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
