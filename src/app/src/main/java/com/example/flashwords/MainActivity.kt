import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @Override
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.webview)
        val webSettings: WebSettings = webView.getSettings()
        webSettings.setJavaScriptEnabled(true) // 启用JavaScript支持
        webView.loadUrl("file:///android_asset/www/index.html")
    }
}