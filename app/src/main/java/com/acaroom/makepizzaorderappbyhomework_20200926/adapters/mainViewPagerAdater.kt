package com.acaroom.makepizzaorderappbyhomework_20200926.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.acaroom.makepizzaorderappbyhomework_20200926.fragments.MyProfileFragment
import com.acaroom.makepizzaorderappbyhomework_20200926.fragments.PizzaStoreFragment

class mainViewPagerAdater(fm:FragmentManager) :FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "피자주문"
            else -> "내 정보 설정"
        }
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> PizzaStoreFragment()
            else -> MyProfileFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}