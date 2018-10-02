<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

/**
 * @property int $jugadorid
 * @property int $equipoid
 * @property string $nombre
 * @property int $edad
 * @property int $ano_ingreso
 * @property Equipo $equipo
 * @property PartidoJugador[] $partidoJugadors
 * @property Sancione[] $sanciones
 */
class jugadores extends Model
{
    /**
     * @var array
     */
    protected $fillable = ['nombre', 'edad', 'ano_ingreso'];

    /**
     * @return \Illuminate\Database\Eloquent\Relations\BelongsTo
     */
    public function equipo()
    {
        return $this->belongsTo('App\Equipo', 'equipoid', 'equipoid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\HasMany
     */
    public function partidoJugadors()
    {
        return $this->hasMany('App\PartidoJugador', 'jugadorid', 'jugadorid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\HasMany
     */
    public function sanciones()
    {
        return $this->hasMany('App\Sancione', 'jugadorid', 'jugadorid');
    }
}
