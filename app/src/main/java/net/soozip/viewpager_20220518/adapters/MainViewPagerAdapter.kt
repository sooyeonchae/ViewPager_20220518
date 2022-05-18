package net.soozip.viewpager_20220518.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import net.soozip.viewpager_20220518.fragments.HelloFragment
import net.soozip.viewpager_20220518.fragments.NameFragment
import net.soozip.viewpager_20220518.fragments.PhoneFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    //각 페이지별 제목 설정
    override fun getPageTitle(position: Int): CharSequence? {

        return when (position) {
            0 -> "이름"
            1 -> "연락처"
            else -> "인사말"
        }
    }

    //몇 장짜리 뷰페이저인지 장수를 리턴.
    override fun getCount() = 3

    //각 위치에 맞는 Fragment 객체들을 리턴.
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> NameFragment()
            1 -> PhoneFragment()
            else -> HelloFragment()
        }
    }

}