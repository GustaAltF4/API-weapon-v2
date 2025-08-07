package com.api.souls.config;

import com.api.souls.entity.Weapon;
import com.api.souls.repository.WpnRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final WpnRepository wpnRepo;


    public DataLoader(WpnRepository wpnRepo) {
        this.wpnRepo = wpnRepo;
    }

    @Override
    public void run(String... args) {
        if (wpnRepo.count() == 0) {
            wpnRepo.saveAll(
                    List.of(
                            new Weapon("Alabarda", "Dark Souls", "Arma de larga empuñadura, mezcla de lanza y hacha. Es difícil de manejar y requiere destreza y fuerza.", "https://static.wikia.nocookie.net/dark-souls/images/2/20/Alabarda.png/revision/latest?cb=20140213180105&path-prefix=es"),
                            new Weapon("Uchigatana", "Dark Souls", "Katana forjada en una tierra del este.Famosa por sus enérgicos movimientos cortantes.", "https://static.wikia.nocookie.net/darksouls/images/e/e5/Uchigatana_%28DSIII%29.png/revision/latest?cb=20160612055045"),
                            new Weapon("Master Sword", "The legend of Zelda", "también conocida como la espada destructora del Mal, es la espada legendaria del reino de Hyrule.", "https://static.wikia.nocookie.net/zelda/images/9/9e/Artwork_Espada_Maestra_TPHD.png/revision/latest?cb=20160704182812&path-prefix=es"),
                            new Weapon("Espada", "Minecraft", "espada de diamante.", "https://minecraft.wiki/images/Diamond_Sword_JE3_BE3.png?24296"),
                            new Weapon("Claymore", "Dark Souls II", "Un espadón muy grande. Muy pesado y diseñado para usarlo con ambas manos.", "https://static.wikia.nocookie.net/dark-souls/images/c/cb/Claymore_%28DSII%29.png/revision/latest?cb=20161112040937&path-prefix=es"),
                            new Weapon("Hoz de Hielo", "Terraria", "Dispara una hoz de hielo","https://static.wikia.nocookie.net/terraria/images/e/ea/Ice_Sickle.png/revision/latest?cb=20200604010634&path-prefix=es"),
                            new Weapon("Espada carnicera", "Terraria", "Es más grande que las espadas largas creadas con minerales y puede golpear a los monstruos que estén por detrás del jugador.", "https://static.wikia.nocookie.net/terraria/images/6/62/Blood_Butcherer.png/revision/latest?cb=20171217041651&path-prefix=es"),
                            new Weapon("Espadón de Caballero negro","Dark Souls", "La pesada hoja de esta espada catapulta al enemigo. La usaban los errantes caballeros negros de Lordran.", "https://static.wikia.nocookie.net/dark-souls/images/6/63/Espad%C3%B3n_del_Rey_Caballero.png/revision/latest?cb=20180202033035&path-prefix=es"),
                            new Weapon("Energy sword", "Halo", "Un arma noble y antigua, manejada por los Sangheili más fuertes , requiere gran habilidad y valentía para su uso, e inspira miedo en aquellos que se enfrentan a su elegante hoja de plasma.","https://static.wikia.nocookie.net/halo/images/f/f1/H5G_Render_Sword.png/revision/latest?cb=20160218140525"),
                            new Weapon("Blades of Chaos","God of War","Las Espadas de Caos, forjadas en las nauseabundas profundidades del Hades. Una vez adheridas, las hojas se mantuvieron así, encadenadas a la carne chamuscada, una prolongación del cuerpo de su portador, un recordatorio permanente de la promesa de Kratos.","https://static.wikia.nocookie.net/godofwar/images/6/61/BladeOfChaos_%28GodOfWarAscension%29.png/revision/latest?cb=20240523231521"),
                            new Weapon("Blade of Olympus","God of War", "La Espada del Olimpo es una gran espada de energía extremadamente poderosa que al llenarla de energía, desprende una luz azul brillante.", "https://static.wikia.nocookie.net/godofwar/images/3/3e/Blade_of_Olympus.png/revision/latest?cb=20241127041323"),
                            new Weapon("Blades of Athena","God of War", "Espadas de gran alcance que te ha asignado la diosa Atenea.","https://static.wikia.nocookie.net/godofwar/images/b/bf/GoWII_Blades_of_Athena.png/revision/latest?cb=20240524072900")

                    )
            );
        }
    }
}
