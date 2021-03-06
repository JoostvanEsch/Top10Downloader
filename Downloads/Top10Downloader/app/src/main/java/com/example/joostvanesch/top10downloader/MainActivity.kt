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

        Log.d(TAG, "onCreate: called")

        val downloadData = DownloadData()
        downloadData.execute("URL")
        Log.d(TAG, "onCreate: done")
    }

    companion object {
        private class DownloadData : AsyncTask<String, Void, String>() {

            private val TAG = "DownloadData"

            override fun doInBackground(vararg params: String?): String {
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                Log.d(TAG, "doInBackground: starts with ${params[0]}")
                return "doInBackground completed"
            }

            override fun onPostExecute(result: String?) {
                super.onPostExecute(result)
                Log.d(TAG, "onPostExecute: parameter is $result")
            }
        }
    }
}
