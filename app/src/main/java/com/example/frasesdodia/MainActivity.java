package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frases = {
            "Apegue-se ao que te faz feliz!","É preciso sorrir!","Amadurecer é trocar razão por paz.","Liberdade é um desejo universal.",
            "Seja o lado bom da vida!","Se puderes olhar, vê. Se puderes ver, repara.","Energize-se.","Ser morada de bons sentimentos!","A vida é agora, não vá se perder!",
            "Ore, descanse e confie.","Em paz com tudo que chega e com tudo que se vai.","Toda luz plantada será colhida.","Preencher a vida com o que te toca a alma e só.",
            "Vá para onde o seu coração te levar.","O analgésico da vida é o tempo.","Certo mesmo é fazer aquilo que o coração manda!","Ser feliz é muito fácil, é só se entregar pra vida!",
            "Não se distancie da sua essência.","Quando todos forem promessas, seja atitude.","Que seja tudo coberto de bem querer.","Aprenda a evoluir sem se perder.",
            "Na paz quero estar.","Caminho raro, coração claro!","Iluminar significa levar luz ao redor.","Gratidão eleva a vibração.",
            "A felicidade te espera, não vá se perder.","A tempestade que sopra, te derruba ou te faz voar?! ","Aqui só cabe amor.",
            "Seja morada de sentimentos bons!","Sem prender, só fluir. Sem voltar, só seguir.","Sou feita de cicatriz e gratidão.","Mente tranquila, vida feliz.",
            "A vida é entrega, disposição.","Faço sentir. Isso me basta.❤","A vida inteira é feita pra gente ser feliz!","Minha fé é gigante, minha positividade ainda maior!",
            "Evoluir leva tempo.","Ame-se, aceite-se, liberte-se. ❤","Felicidade: quando um coração repleto de vida transborda.","A luz que tu precisa tá dentro de você!",
            "Feita para ser o que quiser.","Escolher ser feliz é decisão que conforta o ser!","A vida é agora, agradece e vai.","Perca-se nas coisas que você ama! ❣",
            "Vista-se de felicidade.","Faça do teu próprio coração tua zona de paz. ❤","Cultive-se todos os dias.","Carregue dentro de si apenas o bem!",
            "Tão leve, tão em paz…","Sorria pra vida que ela te sorri de volta!","Ela orou e Deus a abraçou!","Busque no interior o seu abrigo..","Ponha seu coração em cada passo e gesto. ❤",
            "A maior sorte da vida é agradecer!","E sendo, transbordo!","Na alma ninguém manda, ela fica onde se encanta.","Há tantas razões bonitas para ser feliz.. ❤",
            "Onde fores feliz, fica.","Transpirava alegria, era dona dos seus passos.","Siga na paz, eleve a alma.","Encontre em si próprio o melhor lugar pra repousar.",
            "Sorriso livre e alma leve.","Pra ser verdade, basta acreditar..","Existe uma beleza imensurável em ser exatamente quem você é!","Aprendeu que todo amor pode acabar, menos o próprio. ❤",
            "A entrega é seu respirar.","A vida nos obriga a crescer.","Conhece-te a ti mesmo.","Rega-te de amor próprio e seja teu próprio jardim. ❤","Pertenço ao lugar onde me sinto livre!",
            "Acorde, sorria, agradeça.","Longe se vai quem acredita.","Reencontre-se, reequilibre-se, reconstrua-se.","Ser importante é do ego, ser feliz é da alma.","O que não te traz paz, não te traz bem!",
            "A essência transparece.","Coragem é agir com o coração.","Viva simples. Ame grande! ❤","Ninguém perde por dar amor.","A felicidade não entra em portas fechadas…",
            "Você sempre pode, cabe a você querer.","Sorrindo pra onde a sorte me sorrir.","Luz própria, uma alma pura e um sorriso sincero.","Nunca mude o que te faz raro!","O segredo é cultivar-se!",
            "Que todo mal vire amor!","A vida é sobre quem se torna durante a caminhada!","Só é feliz quem sabe o que quer.","Faço de mim casa de sentimentos bons. ❤","Paz, felicidade e amor próprio. O resto é resto.",
            "Minha consciência limpa sempre valeu mais…","Eu sou a paz e só a luz me move.","Viver é a arte de tentar.","Colecionando sorrisos, amores, momentos!",
            "É na simplicidade que se encontra o essencial.","Um riso atrás do outro, é assim que a vida tem que ser.","Meu coração pulsa cores, sons e amores.",
            "Revide sorrisos, compre paz!","Em um mundo de aparências, quem vive de essência é realmente feliz","Só sabe que estagnar não é uma opção",
            "Se liberta que o mundo é teu, e de ti ninguém tira.","Até onde posso, vou deixando o melhor de mim…","Bem-me-quero, me basto.",
            "A vida é um sonho bonito!","Proteja sua paz!","Sou Metade esperança, metade agonia!","Apenas seja! Seja o que tiver de ser, seja o que você veio pra ser!",
            "O pensamento leve faz a gente voar!","O meu coração transborda liberdade!","Seja sempre MAIS que o MENOS que te oferecem!","Leve amor, não pesa!",
            "A vida é muito curta pra não viver sorrindo por aí!","Leve só o que há de bom em você.","Sorriso é pouco, eu gosto de quem me deixa em festa por dentro.",
            "Viva bem, não de bens.","Não tenho pressa, nem dono.","Alma viva, mente sã.","Se for, que seja. Se flor, floresça!","Onde há calma, observo. Onde há alma, absorvo.",
            "Boas energias sempre encontram o caminho certo…","Escolher ser feliz é decisão que conforta o ser.","Florescer exige passar por todas as estações!",
            "Melhor amar do que ser amargo!","Ser Simples é o que te faz grande!","Alma leve e coração agradecido. Sigo em paz","Dance no seu ritmo!",
            "Sorrisos são sempre bem vindos!","Sonhar alto encolhe os nossos medos!","Nem tente… não se pode aprisionar quem tem asas!","Independente da dor, seja sempre flor…",
            "As coisas simples são as principais fontes de alegria.","Vou na fé, guiada pelas boas vibrações.","Se o pensamento é positivo, a maré é sempre boa.",
    };
    //int numeroAleatorio = new Random().nextInt(frases.length);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        int numeroAleatorio = new Random().nextInt(frases.length);

        TextView texto = (TextView) findViewById(R.id.txt_resultado);
        texto.setText(frases[numeroAleatorio]);

    }

    public void compartilhar(View view){

        TextView texto = (TextView) findViewById(R.id.txt_resultado);
        String textoSt = texto.getText().toString();

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, textoSt);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }

    public void copiar(View view){

        TextView texto = (TextView) findViewById(R.id.txt_resultado);
        String textoSt = texto.getText().toString();

        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Text View", textoSt);
        clipboard.setPrimaryClip(clip);

        Toast.makeText(getApplicationContext(), "Texto copiado!", Toast.LENGTH_SHORT).show();

    }
}
