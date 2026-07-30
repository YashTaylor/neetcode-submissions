class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        var mapS = mutableMapOf<Char, Int>()
        var mapT = mutableMapOf<Char, Int>()
        for (i in s.indices)
        {
            mapS[s[i]] = mapS.getOrDefault(s[i], 0) + 1
            mapT[t[i]] = mapT.getOrDefault(t[i], 0) + 1
        }
        return mapS == mapT
    }
}
