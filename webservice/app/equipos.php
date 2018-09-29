<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

/**
 * @property int $equipoid
 * @property int $divisionid
 * @property string $nombre
 * @property string $carrera
 * @property string $facultad
 * @property Divisione $divisione
 * @property Campeonato[] $campeonatos
 * @property Jugadore[] $jugadores
 * @property Partido[] $partidos
 * @property Partido[] $partidos
 * @property Partido[] $partidos
 */
class equipos extends Model
{
    /**
     * The primary key for the model.
     * 
     * @var string
     */
    protected $primaryKey = 'equipoid';

    /**
     * @var array
     */
    protected $fillable = ['divisionid', 'nombre', 'carrera', 'facultad'];

    /**
     * @return \Illuminate\Database\Eloquent\Relations\BelongsTo
     */
    public function divisione()
    {
        return $this->belongsTo('App\Divisione', 'divisionid', 'divisionid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\HasMany
     */
    public function campeonatos()
    {
        return $this->hasMany('App\Campeonato', 'campeon', 'equipoid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\HasMany
     */
    public function jugadores()
    {
        return $this->hasMany('App\Jugadore', 'equipoid', 'equipoid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\HasMany
     */
    public function partidos()
    {
        return $this->hasMany('App\Partido', 'equipo_1', 'equipoid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\HasMany
     */
    public function partidos()
    {
        return $this->hasMany('App\Partido', 'equipo_2', 'equipoid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\HasMany
     */
    public function partidos()
    {
        return $this->hasMany('App\Partido', 'ganador', 'equipoid');
    }
}
