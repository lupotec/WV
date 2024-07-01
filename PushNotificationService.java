package be.app.blank;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import android.util.Log;

public class PushNotificationService extends FirebaseMessagingService {

    private static final String TAG = "PushNotifService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // Handle the received message here.
        Log.d(TAG, "From: " + remoteMessage.getFrom());
        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());
        }
    }

    @Override
    public void onNewToken(String token) {
        // Handle the new token here.
        Log.d(TAG, "Refreshed token: " + token);
    }
}
