Hançer       1.0

Kılıç        1.5

Balta        1.5

Mızrak       2.5

Yay          8.0

Arbalet      10.0

Büyü         10.0

Gemi Topu    20+

CombatFormula
SkillCombatBonus
WeaponCalculation
ArmorCalculation
CriticalCalculation
AggroSystem

Attack
│
▼
DamageCalculationService
│
▼
DodgeCalculationService
│
▼
ParryCalculationService
│
▼
BlockCalculationService
│
▼
CriticalCalculationService
│
▼
WeaponEffectService
│
▼
ArmorCalculationService
│
▼
StatusEffectService
│
▼
Death


✅ 1. Armor Penetration

Silahın armorPenetration değerini gerçek hasar hesabına dahil edeceğiz.

✅ 2. DamageType desteği

SLASH, PIERCE, BLUNT, MAGIC gibi hasar tiplerine göre doğru armor/resist kullanılacak.

✅ 3. Elemental Damage

Silah aynı anda fiziksel ve element hasarı verebilecek.

Örnek:

35 Slash
12 Fire
6 Poison
✅ 4. Resist sistemi

fireResist, poisonResist, iceResist gibi dirençler element hasarını azaltacak.

✅ 5. Death Event

dead = true yerine merkezi bir ölüm işlemi oluşturacağız. Buradan loot, XP, corpse ve respawn sistemleri tetiklenebilecek.

✅ 6. Combat Log

Oyunun UI'sinde kullanılabilecek merkezi combat log altyapısını hazırlayacağız.
