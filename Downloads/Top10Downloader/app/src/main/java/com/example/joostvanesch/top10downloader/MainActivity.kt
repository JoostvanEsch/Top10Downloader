package com.example.joostvanesch.top10downloader

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate called")
    }

    private inner class DownloadData : AsyncTask<String, Void, String>() {

        private val TAG = "DownloadData"

        override fun doInBackground(vararg params: String?): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
        }
    }
}