package io.github.thiminhnhut.fragmentnewinstance.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import io.github.thiminhnhut.fragmentnewinstance.R

class FragmentExample : Fragment() {
    private var text: String? = null
    private var number = -1

    companion object {
        const val ARG_TEXT = "agrText"
        const val ARG_NUMBER = "argNumber"

        fun newInstance(text: String, number: Int) : FragmentExample {
            val fragment = FragmentExample()
            val args = Bundle()
            args.putString(ARG_TEXT, text)
            args.putInt(ARG_NUMBER, number)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_example, container, false)
        val txt_fragment = view.findViewById<TextView>(R.id.text_view_fragment)
        if (arguments != null) {
            text = arguments!!.getString(ARG_TEXT, text)
            number = arguments!!.getInt(ARG_NUMBER, number)
        }
        val contents = text + number
        txt_fragment.text = contents

        return view
    }
}