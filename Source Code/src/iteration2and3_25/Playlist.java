package iteration2and3_25;

import java.util.*;


public class Playlist
{
    private ArrayList<Songs> allSongs;
    public ArrayList<Songs> hyyh = new ArrayList<Songs>();
	public ArrayList<Songs> wings = new ArrayList<Songs>();
	public ArrayList<Songs> ynwa = new ArrayList<Songs>();
	public ArrayList<Songs> tear = new ArrayList<Songs>();
	public ArrayList<Songs> ans = new ArrayList<Songs>();
	public ArrayList<Songs> wb = new ArrayList<Songs>();
	public ArrayList<Songs> ret = new ArrayList<Songs>();
	public ArrayList<Songs> nkbegin = new ArrayList<Songs>();
	public ArrayList<Songs> nkcont = new ArrayList<Songs>();
	public ArrayList<Songs> nkfinal = new ArrayList<Songs>();
	public ArrayList<Songs> bp = new ArrayList<Songs>();
	public ArrayList<Songs> squT = new ArrayList<Songs>();
	public ArrayList<Songs> squU = new ArrayList<Songs>();
	public ArrayList<Songs> aiiyl = new ArrayList<Songs>();
	public ArrayList<Songs> ktl = new ArrayList<Songs>();
	public ArrayList<Songs> tday = new ArrayList<Songs>();
	public ArrayList<Songs> srise = new ArrayList<Songs>();
	public ArrayList<Songs> mrise = new ArrayList<Songs>();
	public ArrayList<Songs> ddream = new ArrayList<Songs>();
	
	
    public Queue<Songs> playlist = new LinkedList<Songs>();
    public Songs result;
    public int time = 0;

    public static void main(String[] args)
    {
    	new Playlist();
    }

    public Playlist()
    {
    	allSongs = new ArrayList<Songs>();
    	fill();
    	result = new Songs("", 0);
    }

    public void fill()
    {
    	Songs a = new Songs("anpanman", 233);
    	tear.add(a);
    	
    	Songs b = new Songs("blood, sweat & tears", 217);
    	wings.add(b);
    	
    	Songs c = new Songs("cypher pt. 3", 268);
    	wings.add(c);
    	
		Songs d = new Songs("dead leaves", 268);
		hyyh.add(d);
		
		Songs e = new Songs("fake love", 242);
		ans.add(e);
		
		Songs f = new Songs("idol", 223);   
		ans.add(f);
		
		Songs g = new Songs("i need u", 211);
    	wings.add(g);

		Songs h = new Songs("love myself", 251);
		ans.add(h);
		
		Songs i = new Songs("ma city", 258);
		hyyh.add(i);

		Songs j = new Songs("magic shop", 276);
		tear.add(j);
		
		Songs k = new Songs("not today", 232);
		ynwa.add(k);

		Songs l = new Songs("run", 236);
		hyyh.add(l);

		Songs m = new Songs("spring day", 213);
		ynwa.add(m);
		
		Songs n = new Songs("the truth untold", 242);
		tear.add(n);

		Songs o = new Songs("whalien 52", 244);
		squT.add(o);
		
		Songs p = new Songs("wings", 225);
		ynwa.add(p);

		Songs q = new Songs("as if it's your last", 213);
		aiiyl.add(q);
		
		Songs r = new Songs("boombayah", 241);
		bp.add(r);
		
		Songs s = new Songs("ddu du ddu du", 209);
		squU.add(s);
		
		Songs t = new Songs("forever young", 297);
		squU.add(t);
		
		Songs u = new Songs("kill this love", 189);
		ktl.add(u);
		
		Songs v = new Songs("kiss and make up", 190);
		aiiyl.add(v);
		
		Songs w = new Songs("playing with fire", 197);
		squT.add(w);

		Songs x = new Songs("really", 198);
		squU.add(x);
		
		Songs y = new Songs("see u later", 199);
		ktl.add(y);
		
		Songs z = new Songs("solo", 169);
		aiiyl.add(z);
		
		Songs aa = new Songs("stay", 230);
		squT.add(aa);
		
		Songs bb = new Songs("whistle", 212);
		bp.add(bb);
    
		Songs cc = new Songs("beautiful feelings", 209);
		tday.add(cc);
		
		Songs dd = new Songs("congratulation", 229);
		tday.add(dd);
		
		Songs ee = new Songs("dance dance", 223);
		srise.add(ee);
		
		Songs ff = new Songs("hi hello", 232);
		mrise.add(ff);
		
		Songs gg = new Songs("how can i say", 201);    
		srise.add(gg);
		
		Songs hh = new Songs("i smile", 227);
		ddream.add(hh);
		
		Songs ii = new Songs("i wait", 218);
		srise.add(ii);
		
		Songs jj = new Songs("i'm serious", 164);
		mrise.add(jj);
		
		Songs kk = new Songs("letting go", 230);
		ddream.add(kk);
		
		Songs ll = new Songs("man in a movie", 226);
		ddream.add(ll);
		
		Songs mm = new Songs("what can i do", 232);
		mrise.add(mm);
		
		Songs nn = new Songs("you were beautiful", 283);
		tday.add(nn);
		
		Songs oo = new Songs("beautiful", 195);
		ret.add(oo);
		
		Songs pp = new Songs("best friend", 230);
		ret.add(pp);
		
		Songs qq = new Songs("bling bling", 219);
		nkbegin.add(qq);
		
		Songs rr = new Songs("cocktail", 226);
		nkcont.add(rr);
		
		Songs ss = new Songs("don't forget", 254);
		nkbegin.add(ss);
		
		Songs tt = new Songs("don't let me know", 201);
		nkfinal.add(tt);
		
		Songs uu = new Songs("dumb & dumber", 243);
		wb.add(uu);
		
		Songs vv = new Songs("everything", 215);
		bp.add(vv);
		
		Songs ww = new Songs("goodbye road", 299);
		nkfinal.add(ww);
		
		Songs xx = new Songs("just for you", 201);
		nkcont.add(xx);
		
		Songs yy = new Songs("killing me", 194);
		nkcont.add(yy);
		
		Songs zz = new Songs("love scenario", 210);
		ret.add(zz);
		
		Songs aaa = new Songs("rhythm ta", 229);
		wb.add(aaa);
		
		Songs bbb = new Songs("rubber band", 197);
		nkbegin.add(bbb);
		
		Songs ccc = new Songs("sinosijak", 188);
		wb.add(ccc);
		
		Songs ddd = new Songs("i'm ok", 254);
		nkfinal.add(ddd);
		
		Songs eee = new Songs("kick it", 199);
		ktl.add(eee);
		
		List<Songs> songTitle = Arrays.asList(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, aa, bb, cc, dd, ee, ff, gg, hh, ii, jj, kk, ll, mm, nn, oo, pp, qq, rr, ss, tt, uu, vv, ww, xx, yy, zz, aaa, bbb, ccc, ddd, eee);
    
		allSongs.addAll(songTitle);

    }

    
    public Songs findSongs(String ttl)
    {
    	ttl = ttl.toLowerCase();

    	for(int i = 0; i < allSongs.size(); i++)
	    {
    		if(ttl.equals(allSongs.get(i).getTitle()))
    			{
    				result = allSongs.get(i);
    				break;
    			}
	    }
    	
    	return result;
    }

    
    public Queue<Songs> addSongs(String ttl)
    {
		Songs store = findSongs(ttl);
    	playlist.add(store);
    	time += store.getTime(); 
    	return playlist;
    }

 
    public void removeSongs()
    {
    	 playlist.remove();
    }
 
    
    public void printing()
    {
    	Songs check;
    	while(playlist.size() != 0)
    	{
    		check = playlist.remove();
    		System.out.println(check.getTitle());
    	}
    }
    
    public int checkTime()
    {
    	return time;
    }
    
    public ArrayList<Songs> getAlbum(String albTitle)
    {
    	
    	if(albTitle.equals("hyyh"))
    	{
    		return hyyh;
    	}
    	
    	else if (albTitle.equals("wings"))
    	{
    		return wings;
    	}
    	
    	else if (albTitle.equals("ynwa"))
    	{
    		return ynwa;
    	}
    	
    	else if (albTitle.equals("tear"))
    	{
    		return tear;
    	}
    	
    	else if (albTitle.equals("ans"))
    	{
    		return ans;
    	}
    	
    	else if (albTitle.equals("wb"))
    	{
    		return wb;
    	}
    	
    	else if (albTitle.equals("ret"))
    	{
    		return ret;
    	}
    	
    	else if (albTitle.equals("nkbegin"))
    	{
    		return nkbegin;
    	}
    	
    	else if (albTitle.equals("nkcont"))
    	{
    		return nkcont;
    	}
    	
    	else if (albTitle.equals("nkfinal"))
    	{
    		return nkfinal;
    	}
    	
    	else if (albTitle.equals("bp"))
    	{
    		return bp;
    	}
    	
    	else if (albTitle.equals("squT"))
    	{
    		return squT;
    	}
    	
    	else if (albTitle.equals("squU"))
    	{
    		return squU;
    	}
    	
    	else if (albTitle.equals("aiiyl"))
    	{
    		return aiiyl;
    	}
    	
    	else if (albTitle.equals("ktl"))
    	{
    		return ktl;
    	}
    	
    	else if (albTitle.equals("tday"))
    	{
    		return tday;
    	}
    	
    	else if (albTitle.equals("srise"))
    	{
    		return srise;
    	}
    	
    	else if (albTitle.equals("mrise"))
    	{
    		return mrise;
    	}
    	
    	else if (albTitle.equals("ddream"))
    	{
    		return ddream;
    	}
    	
    	else
    	{
    		return ddream;
    	}
    }
}
