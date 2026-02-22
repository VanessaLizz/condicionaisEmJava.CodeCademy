package projetosParaPraticar;
import java.util.ArrayList;
import java.util.Arrays;

class Playlist {
    public static void main(String[] args){
        String[] favoriteSongs = {
                "Queen - Bohemian Rhapsody",
                "Michael Jackson - Billie Jean",
                "Adele - Rolling in the Deep",
                "The Beatles - Hey Jude",
                "Bruno Mars - Just the Way You Are",
                "Taylor Swift - Shake It Off",
                "Eminem - Lose Yourself",
                "Coldplay - Viva La Vida",
                "Ed Sheeran - Shape of You",
                "Imagine Dragons - Radioactive"
        };

        for(int n = 0; n < 3; n++){
            System.out.println(favoriteSongs[n]);
        }

        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        desertIslandPlaylist.add("Rihanna - Diamonds");
        desertIslandPlaylist.add("Linkin Park - Numb");
        desertIslandPlaylist.add("Maroon 5 - Sugar");
        desertIslandPlaylist.add("Katy Perry - Firework");
        desertIslandPlaylist.add("U2 - With or Without You");
        System.out.println(desertIslandPlaylist);

        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
        System.out.println("O tamanho do ArrayList é de: " + desertIslandPlaylist.size());
        desertIslandPlaylist.remove(0);
        desertIslandPlaylist.remove(3);
        desertIslandPlaylist.remove(4);
        desertIslandPlaylist.remove(8);
        desertIslandPlaylist.remove(0);
        System.out.println("O tamanho do ArrayList é de: " + desertIslandPlaylist.size());
        System.out.println(desertIslandPlaylist);

        int SongA = desertIslandPlaylist.indexOf("Katy Perry - Firework");
        int SongB = desertIslandPlaylist.indexOf("Bruno Mars - Just the Way You Are");

        String tempA = desertIslandPlaylist.get(SongA);
        desertIslandPlaylist.set(SongA, desertIslandPlaylist.get(SongB));

        System.out.println(desertIslandPlaylist);

        desertIslandPlaylist.set(SongB, tempA);
        System.out.println(desertIslandPlaylist);
    }
}
