# COS MMORPG - Architecture

## Project Purpose

Ultima Online benzeri 2D MMORPG geliştirmek.

Teknolojiler:

* Java
* LibGDX
* Android Studio
* LWJGL3
* TileMap
* Multiplayer Server

---

# Package Structure

## gameobject

Oyundaki tüm nesneler.

İçerik:

* GameObject
* LivingEntity
* Player
* NPC
* Monster
* Animal
* Demon
* Item
* Weapon
* Armor
* Consumable
* Resource
* Furniture
* WorldObject

---

## world

Oyun dünyası.

İçerik:

* WorldMap
* Region
* Chunk
* Tile
* City
* Dungeon
* Zone

Görev:

* Harita yönetimi
* Bölge yönetimi
* Spawn noktaları
* Şehirler
* Zindanlar

---

## system

Oyun mekanikleri.

İçerik:

* Combat
* Inventory
* Equipment
* Loot
* Quest
* Skill
* Crafting
* Trade
* Party
* Guild
* Reputation
* AI

Görev:

Oyunun tüm kurallarını yönetmek.

---

## ui

Kullanıcı arayüzü.

İçerik:

* HUD
* Inventory UI
* Character Profile
* Skill Bar
* Merchant Window
* Dialog Window
* Settings
* Login Screen

---

## server

Sunucu sistemi.

İçerik:

* Network
* Packet
* Session
* Authentication
* Database
* Persistence

Görev:

Çok oyunculu yapıyı yönetmek.

---

## enumtype

Tüm Enum yapıları.

İçerik:

* ObjectStatus
* ItemType
* WeaponType
* ArmorType
* DamageType
* NPCType
* MonsterType
* Direction
* Gender
* SkillType
* TileType
* ZoneType

---

## manager

Global yöneticiler.

İçerik:

* AssetManager
* ScreenManager
* NetworkManager

Not:

Her sistem için manager oluşturulmayacak.

---

## util

Yardımcı sınıflar.

İçerik:

* Math Utilities
* Random Utilities
* Time Utilities
* String Utilities

---

## resource

Oyun kaynakları.

İçerik:

* Textures
* Atlas
* Sounds
* Music
* Fonts
* Maps
* Shaders

---

## screen

LibGDX ekranları.

İçerik:

* SplashScreen
* LoadingScreen
* LoginScreen
* CharacterSelectScreen
* GameScreen

---

# Development Principles

* OOP kullanılacak.
* Enum tercih edilecek.
* String durum değişkenlerinden kaçınılacak.
* Kod tekrarından kaçınılacak.
* Her sınıfın tek sorumluluğu olacak.
* Genişletilebilir mimari tercih edilecek.

GAME BALANCE RULES

- No one-shot kills in PvP
- Maximum item power gap %20
- Combat allows escape even in 1v3
- Control effects are limited and non-chainable
- Items increase build diversity, not raw power
- Endgame progression is horizontal, not vertical
- World events continuously reshape meta

- Güç artışı sınırlı olacak.
- Itemlerde maksimum 5 özellik olacak.
- Oyuncular build çeşitliliği ile güçlenecek.
- En güçlü oyuncu bile 3 oyuncuya karşı dikkatli oynamak zorunda olacak.
- Dungeon ödülleri güç patlaması oluşturmayacak.
- Event sistemi sürekli aktif olacak.
- Oyuncu ekonomisi craft sistemi ile desteklenecek.
- Item durability sistemi olacak.
- Oyuncu şehirleri ve ev sistemi desteklenecek.

1. Enumların kesin listesi
2. Stat sistemi
3. Skill sistemi
4. ItemProperty sistemi
5. Combat formülleri
6. World / TileMap sistemi
7. Sunucu mimarisi

Strength ne işe yarıyor?
Dexterity ne işe yarıyor?
Swordsmanship hasara ne kadar etki ediyor?
Armor hasarı nasıl azaltıyor?

## Monetization Rules

- No pay-to-win.
- No power rewards from advertisements.
- No skill rewards from advertisements.
- No rare items from advertisements.
- Advertisements provide cosmetic and support rewards only.
- Premium membership provides convenience, not power.

Skill Max = 100

Skill OverCap = 120

Global Skill Cap = 700

Global OverCap = 720

Item Skill Bonus = Ayrı

Power Scroll = Var

Skill Unlock = Var

Special Attack Unlock = Var


COS (Chronicles of Something) Architecture Document

Bu doküman bundan sonra projemizin "anayasası" olacak.

1. Oyun
   Tür
   MMORPG

Grafik
3D

Kamera
Eğik (35°-45°)

Kontrol
Mouse + Klavye

Platform
PC

Motor
LibGDX

Dil
Java

Sunucu
Java Server

Veritabanı
PostgreSQL
2. Tasarım Felsefesi

En önemli kararlarımız bunlar.

Her sistem bağımsız olacak.

Örneğin Combat sistemi

Crafting'i bilmeyecek.

Skill sistemi

Combat'ı bilmeyecek.

Magic sistemi

NPC sistemini bilmeyecek.

Hepsi

Service

katmanı üzerinden haberleşecek.

3. Kod Mimarisi
   GameObject

↓

Manager

↓

Service

↓

Loader

↓

Template

↓

Runtime Object
4. Template Mantığı

Hiçbir eşya kod içerisinde oluşturulmayacak.

Örneğin

Katana

koddan değil

WeaponTemplate

üzerinden gelecek.

TemplateManager

↓

WeaponTemplate

↓

ItemInstance

↓

Inventory

↓

Player
5. Combat
   CombatFormulaService

│

├── DamageCalculationService

├── ArmorCalculationService

├── CriticalCalculationService

├── DodgeCalculationService

├── ParryCalculationService

├── BlockCalculationService

├── WeaponEffectService

└── StatusEffectService

Combat bundan sonra değişmeyecek.

Sadece yeni servisler eklenecek.

6. Item
   ItemTemplate

↓

ItemInstance

↓

Inventory

↓

Equipment

Item hiçbir zaman kendi hesap yapmayacak.

Sadece veri taşıyacak.

7. Skill

Yarın yazacağımız sistem.

SkillTemplate

↓

SkillInstance

↓

SkillManager

↓

SkillGainService

↓

SkillCalculationService
8. Magic
   SpellTemplate

↓

SpellService

↓

SpellProjectile

↓

SpellTargetService

↓

SpellEffectService
9. AI
   Brain

↓

Behavior

↓

Movement

↓

Combat

↓

Decision
10. Resource
    Tree

Ore

Bush

Fish

Animal

Hepsi

WorldObject

olacak.

11. Crafting
    RecipeTemplate

↓

CraftService

↓

Result

↓

Inventory
12. NPC
    Vendor

Guard

Citizen

Quest

Bank

Trainer

Innkeeper

Hepsi

Npc

sınıfından türeyecek.

13. World

İşte en önemli kısım.

Biz klasik MMORPG yapmıyoruz.

Bizim dünya yapımız:

World

↓

Kingdom

↓

Region

↓

Island

↓

Chunk

↓

Objects
14. Kingdom

Örneğin

North Kingdom

South Kingdom

Eastern Empire

Western Empire

Her biri

20-100 ada

içerebilir.

15. Region
    North Kingdom

↓

Forest Region

↓

Mountain Region

↓

Farm Region

↓

Capital Region
16. Island

Her ada

Bağımsız map

olacak.

İçerisinde

Town

Forest

Mine

Dungeon

Farm

River

Lake

Boss

Player Islands

bulunabilecek.

17. Oyuncu Adası

Bunu özellikle seviyorum.

Her oyuncunun

1 ada

olacak.

Ada üzerinde

House

Warehouse

Workshop

Forge

Farm

Stable

Dock

Ship

Animals

Workers

NPC

olabilecek.

Oyuncu

isterse

evini büyütecek

isterse

çiftlik kuracak

isterse

ticaret merkezi yapacak.
18. Deniz

Adalar

Gerçek deniz

ile bağlı olacak.

Oyuncular

Ship

ile gezecek.

İleride

Pirate

Kraken

Sea Monster

Fishing

Naval Combat

eklenebilecek.

19. Kamera

Hatırlıyorum.

Bunu özellikle istemiştin.

3D

↓

Yandan

↓

Hafif eğik

↓

Zoom

↓

Rotate yok

Yani

Ultima Online

+

Albion

+

V Rising

karışımı.

20. Oyuncu
    Player

↓

Inventory

↓

Equipment

↓

Skills

↓

Stats

↓

CombatStats

↓

StatusEffects

↓

Quests

↓

Guild

↓

Party

↓

Island
21. Monster
    Monster

↓

Loot

↓

Brain

↓

Spawn

↓

Combat

↓

Skills
22. Economy
    NPC Vendor

↓

Player Vendor

↓

Auction

↓

Bank

↓

Trading
23. Multiplayer
    Client

↓

Packet

↓

Server

↓

World

↓

Database
24. Dosya Yapısı

Ben artık bunu değiştirmem.

com.memokaa.cos

│

├── ai

├── combat

├── crafting

├── effect

├── entity

├── gameobject

├── inventory

├── item

├── loader

├── manager

├── network

├── npc

├── player

├── quest

├── service

├── skill

├── template

├── ui

├── world

└── util

25. Geliştirme Sırası (Roadmap)

Bunu da artık sabitleriz.

✅ Core Objects

✅ Template System

✅ Item System

✅ Combat

🔜 Skill System

⬜ Skill Gain

⬜ Magic

⬜ AI

⬜ Loot

⬜ Resource Gathering

⬜ Crafting

⬜ NPC

⬜ Economy

⬜ Quest

⬜ Guild

⬜ Party

⬜ World

⬜ Multiplayer

⬜ UI

⬜ Polish
Bir tasarım önerisi

Geçmiş konuşmalarımızdan hatırladığım bir hedefin de oyuncuların kendi adalarına sahip olmasıydı. Bunu daha da derinleştirebiliriz.

Şöyle bir hiyerarşi öneriyorum:

World
├── Kingdom
│    ├── Public Islands (şehirler, zindanlar, madenler)
│    ├── Event Islands
│    └── Player Archipelago
│          └── Player Island

Böylece oyuncuların kişisel adaları özel bir "takımadada" bulunur; ana oyun dünyası ise ortak keşif, PvE ve PvP için ayrılır. Bu yapı hem sunucu yönetimi hem de gelecekte ada genişletme, komşu adalar, lonca adaları ve deniz ticareti gibi özellikler için güçlü bir temel sağlar.

Bundan sonra

Artık mimariyi değiştirmeden ilerleyebiliriz. Bir sonraki büyük adım olarak Skill System'i de Combat kadar modüler ve genişletilebilir şekilde kuracağız. Bu sistem daha sonra Combat, Crafting, Gathering, Magic ve NPC eğitim mekaniklerinin ortak temeli olacak.
