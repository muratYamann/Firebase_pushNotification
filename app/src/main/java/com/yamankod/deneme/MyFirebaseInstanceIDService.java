package com.yamankod.deneme;
/**
 * Created by murat on 20.12.2016.
 */
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
/*
 TODO :  onTokenRefresh() methodu
   uygulama ilk kurulduğunda ,Token oluştuğu zaman otomatik olarak çağırılacaktır.
 TODO :  onTokenRefresh() methodu
  sadece uygulama ilk kurulduğunda çalışmaz.
  Firebase ,token değiştiği zamanda otomatik olarak bu methodu çağıracaktır.

   Bu Token sizin cihazınıza özel bir unique token’dır ve notifikasyon gönderilirken
   bu token sayesinde sizin cihazınıza notifikasyon gönderilmektedir.
    Oluşan token’ı  sendRegistrationToServer methoduna gönderdik. Bu methodda oluşmuş olan token’ı
    servisimize gönderme işlemlerini yapmalısınız.
    Bunu Asynctask , volley kütüphanesi veya Retrofit
   kütüphanelerini ile yapabilirsiniz. Bu yapıyı nasıl kuracağınıza siz karar verebilirsiniz.
* */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService{
    private static final String TAG = "MyFirebaseIIDService";
    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Token: " + token);

        sendRegistrationToServer(token);
    }

    private void sendRegistrationToServer(String token) {
        // token'ı servise gönderme işlemlerini bu methodda yapmalısınız
    }
}