package setandmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PokemonMaster {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int pokemonNumber = Integer.parseInt(st.nextToken());
        int questionNumber = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> pokemonMapString = new HashMap<>();
        HashMap<Integer, String> pokemonMapInteger = new HashMap<>();

        for (int i = 0; i < pokemonNumber; i++) {
            String pokeMon = br.readLine();
            pokemonMapString.put(pokeMon, (i+1));
            pokemonMapInteger.put((i+1), pokeMon);
        }

        for (int i = 0; i < questionNumber; i++) {
            String findPokeMon = br.readLine();
            if(isStringNumber(findPokeMon)){ // 숫자여서 문자 돌려줘야함
                sb.append(pokemonMapInteger.get(Integer.parseInt(findPokeMon)));

            }else{ // 문자여서 숫자 돌려줘야함
                sb.append(pokemonMapString.get(findPokeMon));
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }

    public static boolean isStringNumber(String str){
        try{
            Double.parseDouble(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
