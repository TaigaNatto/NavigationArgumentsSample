package natto.com.navigationargumentssample

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment : Fragment() {

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val message = arguments?.getString("message") ?: ""
        val number = arguments?.getInt("number") ?: 0
        view.findViewById<TextView>(R.id.text).text = "$message($number)"

        return view
    }
}
