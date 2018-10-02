<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

/**
 * @property int $lugarid
 * @property string $nombre
 * @property string $ubicacion
 * @property string $capacidad
 * @property Partido[] $partidos
 */
class lugares extends Model
{
    /**
     * The primary key for the model.
     * 
     * @var string
     */
    protected $primaryKey = 'lugarid';

    /**
     * @var array
     */
    protected $fillable = ['nombre', 'ubicacion', 'capacidad'];

    /**
     * @return \Illuminate\Database\Eloquent\Relations\HasMany
     */
    public function partidos()
    {
        return $this->hasMany('App\Partido', 'lugarid', 'lugarid');
    }
}
