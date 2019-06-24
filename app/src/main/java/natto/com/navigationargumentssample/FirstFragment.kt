package natto.com.navigationargumentssample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        view.findViewById<Button>(R.id.button).setOnClickListener {
            val bundle = bundleOf(
                "message" to "Hello! GODIVA!",
                "number" to 1024
            )
            Navigation.findNavController(it).navigate(R.id.action_firstFragment_to_secondFragment, bundle)
        }

        return view
    }
}
