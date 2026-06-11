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

