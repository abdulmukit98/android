//Button responce

    public void onClick(View view){
        Intent intent = new Intent(MainActivity.this, DelayMessageService.class);
        intent.putExtra("message", getResources().getString(R.string.responce));
        startService(intent);
    }
   
//notification builder class


public class DelayMessageService extends IntentService {

    public DelayMessageService() {
        super("DelayMessageService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        synchronized (this){
            try {
                wait(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        String text = (String) intent.getExtras().get("message");
        showText(text);
    }

    public static final int notificationId = 5453;  //random id
    public static final String channelId = "abc";
    public void showText(String text){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(android.R.drawable.star_on)
                .setContentTitle(getResources().getString(R.string.question))
                .setContentText(text)
                .setAutoCancel(true);

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pendingIntent);

        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        NotificationChannel channel = new NotificationChannel(channelId, "channel",NotificationManager.IMPORTANCE_DEFAULT);
        builder.setChannelId(channelId);

        manager.notify(notificationId, builder.build());
    }

}
