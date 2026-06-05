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

https://github.com/kodcumemo/cos-mmorpg.git


echo "# cos-mmorpg" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/kodcumemo/cos-mmorpg.git
git push -u origin main
